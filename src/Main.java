public class Main {

    public static void main(String[] args) {

        Cupon[] cupones = new Cupon[6];
        cupones[0] = new Cupon("TEC10", 10, "Tecnologia", true);
        cupones[1] = new Cupon("TEC25", 25, "Tecnologia", false);
        cupones[2] = new Cupon("ROPA15", 15, "Ropa", true);
        cupones[3] = new Cupon("ROPA30", 30, "Ropa", true);
        cupones[4] = new Cupon("HOGAR20", 20, "Hogar", true);
        cupones[5] = new Cupon("HOGAR40", 40, "Hogar", false);

        GestorCupones gestor = new GestorCupones(cupones);

        System.out.println("=== LISTADO DE CUPONES ===");
        System.out.println(gestor.listarCupones());

        System.out.println("Cupones activos: " + gestor.contarActivos());

        System.out.println("Promedio de descuento: " + String.format("%.2f", gestor.calcularPromedioDescuento()) + "%");
        System.out.println();

        System.out.println("=== BÚSQUEDA ===");
        Cupon encontrado = gestor.buscarPorCodigo("ROPA30");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        } else {
            System.out.println("ROPA30 no encontrado");
        }

        Cupon noExiste = gestor.buscarPorCodigo("XYZ99");
        if (noExiste == null) {
            System.out.println("XYZ99 no encontrado (retornó null)");
        } else {
            System.out.println("Encontrado: " + noExiste.mostrarInformacion());
        }
        System.out.println();

        System.out.println("=== CATEGORÍA: Tecnologia ===");
        System.out.println(gestor.listarPorCategoria("Tecnologia"));
        System.out.println("=== CATEGORÍA: Hogar ===");
        System.out.println(gestor.listarPorCategoria("Hogar"));

        System.out.println("=== CATEGORÍA: Juguetes ===");
        System.out.println(gestor.listarPorCategoria("Juguetes"));
        System.out.println();

        System.out.println("=== DESAFÍO ===");
        Cupon mayor = gestor.obtenerActivoMayorPorcentaje();
        if (mayor != null) {
            System.out.println("Cupón activo con mayor porcentaje: " + mayor.mostrarInformacion());
        }
    }
}