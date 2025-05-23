--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: employees; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employees (
    empid character varying(20) NOT NULL,
    empname character varying(20),
    job character varying(20),
    salary numeric(10,0)
);


ALTER TABLE public.employees OWNER TO postgres;

--
-- Name: orders; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orders (
    order_id character varying(20) NOT NULL,
    p_id character varying(20) NOT NULL,
    quantity numeric(5,0),
    userid character varying(20)
);


ALTER TABLE public.orders OWNER TO postgres;

--
-- Name: products; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.products (
    p_id character varying(20) NOT NULL,
    p_name character varying(20),
    p_companyname character varying(20),
    p_price numeric(10,2),
    our_price numeric(10,2),
    p_tax numeric(3,0),
    quantity numeric(5,0),
    status character varying(1)
);


ALTER TABLE public.products OWNER TO postgres;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    userid character varying(20) NOT NULL,
    empid character varying(20),
    password character varying(20),
    usertype character varying(20),
    username character varying(20)
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Data for Name: employees; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employees (empid, empname, job, salary) FROM stdin;
E102	Neha Patel	Receptionist	28000
E103	Aman Singh	Receptionist	27500
E104	Priya Mehta	Receptionist	29000
E106	Meena Iyer	Receptionist	27000
E107	Sahil Khan	Receptionist	27500
E108	Nidhi Raut	Receptionist	28500
E109	Anil Joshi	Staff	24000
E110	Kavita Nair	Cleaner	18000
E111	Varun Rao	Staff	20000
E112	Sneha Kulkarni	Staff	23000
E113	Deepak Tiwari	Staff	22000
E114	Ruchi Bansal	Staff	25000
E115	Ashok Kumar	Cleaner	21000
E101	Lavanya Asole	Manager	60000
E116	Vinita Sachdev	Receptionist	50000
E105	Rohan Das	Staff	15000
E117	Yana Dhanewar	Receptionist	42000
\.


--
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.orders (order_id, p_id, quantity, userid) FROM stdin;
O101	P101	2	neha123
O101	P102	1	neha123
O102	P101	1	aman123
O102	P102	3	aman123
O103	P101	2	neha123
O103	P102	3	neha123
O104	P102	4	vinita123
O105	P102	3	vinita123
O105	P103	2	vinita123
O105	P104	1	vinita123
O106	P102	3	vinita123
O106	P103	4	vinita123
\.


--
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.products (p_id, p_name, p_companyname, p_price, our_price, p_tax, quantity, status) FROM stdin;
P101	Parle-G Biscuits	Parle	10.00	9.00	5	95	N
P105	Amul Fresh Cream	Amul	20.00	20.00	5	30	Y
P104	Amul Butter	Amul	15.00	15.00	5	49	Y
P102	Amul Milk 1L	Amul	60.00	58.00	5	31	Y
P103	Maggie	Nestle	15.00	14.00	5	44	Y
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (userid, empid, password, usertype, username) FROM stdin;
neha123	E102	neha@123	Receptionist	Neha Patel
priya123	E104	priya@123	Receptionist	Priya Mehta
nidhi123	E108	nidhi@123	Receptionist	Nidhi Raut
lavanya123	E101	lavanya@123	Manager	Lavanya Asole
rohan123	E105	rohan@123	Staff	Rohan Das
vinita123	E116	vinita@123	Receptionist	Vinita Sachdev
sahil123	E107	sahil@123	Receptionist	Sahil Khan
yana123	E117	yana@123	Receptionist	Yana Dhanewar
meena123	E106	meena@123	Receptionist	Meena Iyer
\.


--
-- Name: employees employees_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (empid);


--
-- Name: orders pk_orders; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT pk_orders PRIMARY KEY (order_id, p_id);


--
-- Name: products products_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (p_id);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (userid);


--
-- Name: orders orders_p_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_p_id_fkey FOREIGN KEY (p_id) REFERENCES public.products(p_id);


--
-- Name: users users_empid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_empid_fkey FOREIGN KEY (empid) REFERENCES public.employees(empid) ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

