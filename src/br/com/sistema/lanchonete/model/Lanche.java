package br.com.sistema.lanchonete.model;

public class Lanche {
    private final String pao;
    private final String carne;
    private final String molho;
    private final boolean bacon;
    private final boolean queijo;

    private Lanche(Builder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.molho = builder.molho;
        this.bacon = builder.bacon;
        this.queijo = builder.queijo;
    }

    public String getPao() {
        return pao;
    }

    public String getCarne() {
        return carne;
    }

    public String getMolho() {
        return molho;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public static class Builder {
        private String pao;
        private String carne;
        private String molho;
        private boolean bacon;
        private boolean queijo;

        public Builder(String pao, String carne) {
            this.pao = pao;
            this.carne = carne;
        }

        public Builder molho(String molho) {
            this.molho = molho;
            return this;
        }

        public Builder bacon() {
            this.bacon = true;
            return this;
        }

        public Builder queijo() {
            this.queijo = true;
            return this;
        }

        public Lanche build() {
            if (pao == null || pao.isBlank() || carne == null || carne.isBlank()) {
                throw new IllegalArgumentException("Pao e Carne são obrigatorios!!!");
            }
            return new Lanche(this);
        }
    }

    @Override
    public String toString() {
        return "Lanche: pão " + pao + ", carne " + carne
                + ", " + (molho != null ? molho : "sem molho")
                + ", " + (bacon ? "com bacon" : "sem bacon")
                + ", " + (queijo ? "com queijo" : "sem queijo");
    }
}
