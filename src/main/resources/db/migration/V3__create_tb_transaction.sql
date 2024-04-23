DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_tables WHERE tablename = 'tb_transaction') THEN
        CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE tb_transaction (
                             id UUID PRIMARY KEY,
                             buyer_id UUID,
                             store_id UUID,
                             value DOUBLE PRECISION,
                             created_at TIMESTAMP,
                             updated_at TIMESTAMP,
                             CONSTRAINT fk_transaction_buyer FOREIGN KEY (buyer_id) REFERENCES tb_buyer(id),
                             CONSTRAINT fk_transaction_store FOREIGN KEY (store_id) REFERENCES tb_store(id)
);
END IF;
END $$;
