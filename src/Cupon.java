public class Cupon {

    private String codigo;
    private double porcentaje;
    private String categoria;
    private boolean activo;

    public Cupon(String codigo, double porcentaje, String categoria, boolean activo) {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
        this.categoria = categoria;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public String mostrarInformacion() {
        String estado;
        if (activo) {
            estado = "Activo";
        } else {
            estado = "Inactivo";
        }
        return codigo + " - " + porcentaje + "% - " + categoria + " - " + estado;
    }
}