CREATE SEQUENCE seq_controlcenter START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS "public"."catalog" (
  "id"         INT8 DEFAULT nextval('seq_controlcenter' :: REGCLASS) NOT NULL PRIMARY KEY,
  "state"       NUMERIC,
  "radius"       NUMERIC,
  "speed"       NUMERIC,
  "angleslopespeedvector"       NUMERIC,
  "inclination"       NUMERIC,
  "longitudeascendingnode"       NUMERIC,
  "argumentoflatitude"       NUMERIC,
  "x"       NUMERIC,
  "y"       NUMERIC,
  "z"       NUMERIC,
  "vx"       NUMERIC,
  "vy"       NUMERIC,
  "vz"       NUMERIC,
  "fi"       NUMERIC,
  "lambda"       NUMERIC,
  "height"       NUMERIC,
  "sigmar"       NUMERIC,
  "sigmav"       NUMERIC,
  "sigmatetta"       NUMERIC,
  "sigmax"       NUMERIC,
  "sigmafi"       NUMERIC,
  "sigmab"       NUMERIC);