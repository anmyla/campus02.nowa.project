package at.campus02.nowa.figures;

public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    protected int size;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int j = 0; j < size; j++) {
                for (int col = 0; col < 3; col++) {
                    for (int i = 0; i < size; i++) {
                        sb.append(symbol[col][row]);
                    }
                } sb.append('\n');
            }
        }

        return sb.toString();
    }


}

/*   public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
            }
            sb.append('\n');
            for (int col = 0; col < 3; col++) {
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
            }
            sb.append('\n');
            for (int col = 0; col < 3; col++) {
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
                sb.append(symbol[col][row]);
            }
            sb.append('\n');
        }
        return sb.toString();
    } */

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                sb.append(symbol[row][col]);
//            }
//            sb.append('\n');
//        }
//
//        return sb.toString();
//    }
