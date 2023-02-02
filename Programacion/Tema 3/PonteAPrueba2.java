public class PonteAPrueba2 {
    public static void main (String[] args){

        final String ESQUINA_IZQUIERDA_ARRIBA = "\u250C";
        final String ESQUINA_DERECHA_ARRIBA = "\u2510";
        final String ESQUINA_IZQUIERDA_ABAJO = "\u2514";
        final String ESQUINA_DERECHA_ABAJO = "\u2518";
        final String CENTRO_ARRIBA = "\u252C";
        final String CENTRO_ABAJO = "\u2534";
        final String LINEA_HORIZONTAL="\u2500";
        final String LINEA_VERTICAL = "\u2502";
        final String CASILLA_BLANCA = "\u2591";
        final String CASILLA_NEGRA = "\u2588";
        final String UNION_IZQUIERDA = "\u251C";
        final String UNION_DERECHA = "\u2524";
        final String CENTRO = "\u253C";

        // CUADRADO 1

        System.out.println("CUADRADO BLANCO Y NEGRO 1X1: ");
        System.out.println(ESQUINA_IZQUIERDA_ARRIBA + LINEA_HORIZONTAL + LINEA_HORIZONTAL + ESQUINA_DERECHA_ARRIBA);
        System.out.println(LINEA_VERTICAL + CASILLA_BLANCA + CASILLA_NEGRA + LINEA_VERTICAL);
        System.out.println(ESQUINA_IZQUIERDA_ABAJO + LINEA_HORIZONTAL + LINEA_HORIZONTAL + ESQUINA_DERECHA_ABAJO);

        //CUADRADO 2

        System.out.println("CUADRADO BLANCO Y NEGRO 2X2: ");
        System.out.println(ESQUINA_IZQUIERDA_ARRIBA + LINEA_HORIZONTAL + LINEA_HORIZONTAL + CENTRO_ARRIBA + LINEA_HORIZONTAL + LINEA_HORIZONTAL + ESQUINA_DERECHA_ARRIBA);
        System.out.println(LINEA_VERTICAL + CASILLA_BLANCA + CASILLA_NEGRA + LINEA_VERTICAL + CASILLA_BLANCA + CASILLA_NEGRA + LINEA_VERTICAL);
        System.out.println(UNION_IZQUIERDA + LINEA_HORIZONTAL + LINEA_HORIZONTAL + CENTRO + LINEA_HORIZONTAL + LINEA_HORIZONTAL + UNION_DERECHA);
        System.out.println(LINEA_VERTICAL + CASILLA_BLANCA + CASILLA_NEGRA + LINEA_VERTICAL + CASILLA_BLANCA + CASILLA_NEGRA + LINEA_VERTICAL);
        System.out.println(ESQUINA_IZQUIERDA_ABAJO + LINEA_HORIZONTAL + LINEA_HORIZONTAL + CENTRO_ABAJO + LINEA_HORIZONTAL + LINEA_HORIZONTAL + ESQUINA_DERECHA_ABAJO);
    }
}