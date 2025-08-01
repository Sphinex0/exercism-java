class SqueakyClean {
    static String clean(String identifier) {
        String res = "";
        boolean upper = false;
        for (char ch:identifier.toCharArray()){
            switch (ch){
                case ' ' -> res += "_" ;
                case '-' -> upper = true ;
                case '4' -> res += 'a' ;
                case '3' -> res += 'e' ;
                case '0' -> res += 'o' ;
                case '1' -> res += 'l' ;
                case '7' -> res += 't' ;
                default -> {
                    if (upper){
                    res += Character.toUpperCase(ch);
                    upper = false;
                    }else if (Character.isLetter(ch)){
                        res += ch;                    
                    }
                }
            }
        }
        return res;
    }
}
