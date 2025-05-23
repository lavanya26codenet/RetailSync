
package RetailSync.pojo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author Admin
 */
public class Barcode_IMG_Generator {
    public static void createImage(String image_name, String myString) {
    try {
        Code128Bean code128 = new Code128Bean();
        code128.setHeight(15f);
        code128.setModuleWidth(0.3);
        code128.doQuietZone(true);
        code128.setQuietZone(10);

        // Generate barcode into a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(
            baos,
            "image/x-png",
            300,
            BufferedImage.TYPE_BYTE_BINARY,
            false,
            0
        );

        code128.generateBarcode(canvas, myString);
        canvas.finish();

        // Read barcode image
        BufferedImage barcodeImage = canvas.getBufferedImage();

        // Add top/bottom padding
        int paddingTop = 20;
        int paddingBottom = 20;
        int newHeight = barcodeImage.getHeight() + paddingTop + paddingBottom;

        BufferedImage paddedImage = new BufferedImage(
            barcodeImage.getWidth(),
            newHeight,
            BufferedImage.TYPE_BYTE_BINARY
        );

        // Draw barcode into the new padded image
        java.awt.Graphics2D g = paddedImage.createGraphics();
        g.setColor(java.awt.Color.WHITE);
        g.fillRect(0, 0, paddedImage.getWidth(), paddedImage.getHeight()); // fill background
        g.drawImage(barcodeImage, 0, paddingTop, null); // draw barcode lower, leaving top margin
        g.dispose();

        // Write final image to file
        String userdir = System.getProperty("user.dir");
        FileOutputStream fos = new FileOutputStream(userdir + "\\Barcode\\" + image_name);
        javax.imageio.ImageIO.write(paddedImage, "png", fos);
        fos.flush();
        fos.close();

        System.out.println("Barcode saved at: " + userdir + "\\Barcode\\" + image_name);

    } catch (Exception e) {
        System.out.println("Exception in Barcode generation: " + e.getMessage());
        e.printStackTrace();
    }
}

}
