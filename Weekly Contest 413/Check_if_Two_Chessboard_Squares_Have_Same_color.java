class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isSameColor(coordinate1) == isSameColor(coordinate2);
    }
    
    private boolean isSameColor(String coordinate) {
        char column = coordinate.charAt(0);
        int row = Character.getNumericValue(coordinate.charAt(1));
        int columnIndex = column - 'a' + 1;
        return (columnIndex + row) % 2 == 0;
    }
}
