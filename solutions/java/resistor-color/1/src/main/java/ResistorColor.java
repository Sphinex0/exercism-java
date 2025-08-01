class ResistorColor {
    int colorCode(String color) {
        String[] colors = colors();
        int index = -1;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        return new String[] {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    }
}
