DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_tables WHERE tablename = 'tb_buyer') THEN
        CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE tb_buyer (
                          id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) UNIQUE NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          balance DOUBLE PRECISION NOT NULL,
                          cpf VARCHAR(14) UNIQUE NOT NULL,
                          created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
END IF;
END $$;
