package sk.itsovy.ganoczi.chess;

public class Chess {

    public String normalize(String item){
        if (item==null || item.length()!=2){
            return null;
        }
        item=item.toUpperCase();

        if (Character.isDigit(item.charAt(0)) && Character.isLetter(item.charAt(1))){
            item=item.charAt(1) + String.valueOf(item.charAt(0));
        }
        if (item.charAt(0) < 65 || item.charAt(0) > 72) {
            System.out.println("1");
            return null;
        }
        if (item.charAt(1) < 49 || item.charAt(1) > 56) {
            System.out.println("2");
            return null;
        }
        return item;
    }

    public boolean checkBishop(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            System.out.println("1");
            return false;
        }
        if (pos.equals(dest)){
            System.out.println("2");
            return false;
        }
        if (Math.abs(pos.charAt(0)-dest.charAt(0))==Math.abs(pos.charAt(1) -dest.charAt(1))){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkKing(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            System.out.println("1");
            return false;
        }
        if (pos.equals(dest)){
            System.out.println("2");
            return false;
        }
        if (Math.abs(pos.charAt(0)-dest.charAt(0))<= Math.abs(1) && Math.abs(pos.charAt(1) -dest.charAt(1))<=Math.abs(1)){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkQueen(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            System.out.println("1");
            return false;
        }
        if (pos.equals(dest)){
            System.out.println("2");
            return false;
        }
        //queen is limited by moves like bishop or rook
        if ((Math.abs(pos.charAt(0)-dest.charAt(0))==Math.abs(pos.charAt(1) -dest.charAt(1))
                || (pos.charAt(0)==dest.charAt(0) || pos.charAt(1)==dest.charAt(1)))){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkRook(String pos, String dest){
        //veza
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            System.out.println("1");
            return false;
        }
        if (pos.equals(dest)){
            System.out.println("2");
            return false;
        }
        if (pos.charAt(0)==dest.charAt(0) || pos.charAt(1)==dest.charAt(1)){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkKnight(String pos, String dest){
        //jazdec
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            System.out.println("1");
            return false;
        }
        if (pos.equals(dest)){
            System.out.println("2");
            return false;
        }
        int i = Math.abs(pos.charAt(0) - dest.charAt(0));
        int j = Math.abs(pos.charAt(1) - dest.charAt(1));
        if ((i ==1 && j ==2) || (i ==2 && j ==1)){
            return true;
        } else {
            return false;
        }
    }

}
