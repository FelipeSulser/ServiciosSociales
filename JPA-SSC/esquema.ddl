CREATE TABLE CIUDADANO (ID BIGINT NOT NULL, APELLIDO1 VARCHAR(255) NOT NULL, APELLIDO2 VARCHAR(255), DNI VARCHAR(255) NOT NULL UNIQUE, FECHA_NACIMIENTO DATE NOT NULL, NACIONALIDAD VARCHAR(255) NOT NULL, NOMBRE VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE CITA (ID BIGINT NOT NULL, COMENTARIOS VARCHAR(255), FECHA DATE NOT NULL, TIPO_DE_CITA VARCHAR(255) NOT NULL, CIUDADANO_ID BIGINT NOT NULL, PROFESIONAL_ID BIGINT NOT NULL, PRIMARY KEY (ID))
CREATE TABLE EXPEDIENTE (ID BIGINT NOT NULL, CSS VARCHAR(255) NOT NULL, FECHA_APERTURA DATE NOT NULL, ZONA VARCHAR(255) NOT NULL, CIUDADANO_EXP_ID BIGINT NOT NULL, PRIMARY KEY (ID))
CREATE TABLE PROFESIONAL (ID BIGINT NOT NULL, APELLIDO1 VARCHAR(255) NOT NULL, APELLIDO2 VARCHAR(255), DNI VARCHAR(255) NOT NULL UNIQUE, NOMBRE VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE VIVIENDA (ID BIGINT NOT NULL, CALLE VARCHAR(255) NOT NULL, CODIGO_POSTAL VARCHAR(255) NOT NULL, CONDICIONES VARCHAR(255), METROS_CUADRADOS VARCHAR(255), MUNICIPIO VARCHAR(255) NOT NULL, REGIMEN_TENENCIA VARCHAR(255) NOT NULL, TELEFONO VARCHAR(255), PROPIETARIO_ID BIGINT, EXPEDIENTE_RESIDENCIA_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE FAMILIAR (ID BIGINT NOT NULL, APELLIDO1 VARCHAR(255) NOT NULL, APELLIDO2 VARCHAR(255), DNI VARCHAR(255) NOT NULL UNIQUE, FECHA_NACIMIENTO DATE NOT NULL, INGRESO_MEDIO FLOAT, MU VARCHAR(255), NOMBRE VARCHAR(255) NOT NULL, PARENTESCO VARCHAR(255) NOT NULL, EXPEDIENTE_FAM_ID BIGINT NOT NULL, PRIMARY KEY (ID))
CREATE TABLE INTERVENCIONES (ID BIGINT NOT NULL, ANOTACIONES VARCHAR(255), FECHA DATE NOT NULL, ID_CITA_ID BIGINT NOT NULL, INTERVENCIONES_EXP_ID BIGINT NOT NULL, PRIMARY KEY (ID))
ALTER TABLE CITA ADD CONSTRAINT CITAPROFESIONAL_ID FOREIGN KEY (PROFESIONAL_ID) REFERENCES PROFESIONAL (ID)
ALTER TABLE CITA ADD CONSTRAINT CITA_CIUDADANO_ID FOREIGN KEY (CIUDADANO_ID) REFERENCES CIUDADANO (ID)
ALTER TABLE EXPEDIENTE ADD CONSTRAINT XPDENTECDDANOEXPID FOREIGN KEY (CIUDADANO_EXP_ID) REFERENCES CIUDADANO (ID)
ALTER TABLE VIVIENDA ADD CONSTRAINT VVENDAPRPIETARIOID FOREIGN KEY (PROPIETARIO_ID) REFERENCES EXPEDIENTE (ID)
ALTER TABLE VIVIENDA ADD CONSTRAINT VVNDXPDNTRSDNCIAID FOREIGN KEY (EXPEDIENTE_RESIDENCIA_ID) REFERENCES EXPEDIENTE (ID)
ALTER TABLE FAMILIAR ADD CONSTRAINT FMLARXPDIENTEFAMID FOREIGN KEY (EXPEDIENTE_FAM_ID) REFERENCES EXPEDIENTE (ID)
ALTER TABLE INTERVENCIONES ADD CONSTRAINT NTRVNCNNTRVNCNSXPD FOREIGN KEY (INTERVENCIONES_EXP_ID) REFERENCES EXPEDIENTE (ID)
ALTER TABLE INTERVENCIONES ADD CONSTRAINT NTRVENCIONESDCTAID FOREIGN KEY (ID_CITA_ID) REFERENCES CITA (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
