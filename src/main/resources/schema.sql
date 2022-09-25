CREATE TABLE IF NOT EXISTS public.kullanici
(
    id numeric(10,0) NOT NULL,
    adi character varying(50),
    soyadi character varying(100),
    sifre character varying(20),
    CONSTRAINT kullanici_pkey PRIMARY KEY (id)
)