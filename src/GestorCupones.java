public class GestorCupones {

    // Asociación: el arreglo se conserva como atributo
    private Cupon[] cupones;

    public GestorCupones(Cupon[] cupones) {
        this.cupones = cupones;
    }

    public int contarActivos() {
        int contador = 0;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public Cupon buscarPorCodigo(String codigo) {
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].getCodigo().equals(codigo)) {
                return cupones[i];
            }
        }
        return null;
    }

    public double calcularPromedioDescuento() {
        double suma = 0;
        int validos = 0;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null) {
                suma += cupones[i].getPorcentaje();
                validos++;
            }
        }
        if (validos == 0) {
            return 0;
        }
        return suma / validos;
    }

    public String listarPorCategoria(String categoria) {
        String resultado = "";
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].getCategoria().equalsIgnoreCase(categoria)) {
                resultado += cupones[i].mostrarInformacion() + "\n";
            }
        }
        if (resultado.equals("")) {
            return "No hay cupones en la categoría " + categoria;
        }
        return resultado;
    }

    public String listarCupones() {
        String resultado = "";
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null) {
                resultado += cupones[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    // Desafío
    public Cupon obtenerActivoMayorPorcentaje() {
        Cupon mayor = null;
        for (int i = 0; i < cupones.length; i++) {
            if (cupones[i] != null && cupones[i].isActivo()) {
                if (mayor == null || cupones[i].getPorcentaje() > mayor.getPorcentaje()) {
                    mayor = cupones[i];
                }
            }
        }
        return mayor;
    }
}