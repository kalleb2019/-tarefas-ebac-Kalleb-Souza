package br.com.souza.animal_service.entities.enums;

public enum TipoAnimal {

    GATO(1),
    CACHORRO(2),
    OUTROS(3);

    private final int indice;

    TipoAnimal(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public static String valueOf(int indice) {
        for (TipoAnimal tipoAnimal : TipoAnimal.values()) {
            if (tipoAnimal.getIndice() == indice) {
                return tipoAnimal.name();
            }
        }
        throw new IllegalArgumentException("Índice inválido: " + indice);
    }
}