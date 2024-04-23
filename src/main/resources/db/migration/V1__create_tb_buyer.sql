DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_tables WHERE tablename = 'tb_user') THEN
        CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE tb_buyer (
                          id UUID DEFAULT uuid_generate_v4 () PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) UNIQUE NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          balance DOUBLE PRECISION NOT NULL,
                          cpf VARCHAR(14) UNIQUE NOT NULL,
                          created_at TIMESTAMP WITHOUT TIME ZONE,
                          updated_at TIMESTAMP WITHOUT TIME ZONE
);
END IF;
END $$;
