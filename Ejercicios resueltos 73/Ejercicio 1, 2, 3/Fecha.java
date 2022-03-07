public class Fecha {
    private Integer anio;
    private Integer mes;
    private Integer dia;
    static final String[] mesLetra = { "",
            "Ene", "Feb", "Mar", "Abr", "May", "Jun",
            "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"
    };

    Fecha(Integer a, Integer m, Integer d) {
        asignar(a, m, d);
    }

    Fecha(Fecha f) {
        asignar(f.anio, f.mes, f.dia);
    }

    public void asignar(Integer a, Integer m, Integer d) {
        anio = a;
        mes = m;
        dia = d;
    }

    public String toString() {
        return dia + " de " + mesLetra[mes] + " de " + anio;
    }
}