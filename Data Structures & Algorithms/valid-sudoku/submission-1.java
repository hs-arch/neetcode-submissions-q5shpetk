class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // trying to do it using hashSet for uniqueness.

        // will use this hashset to check for duplicates.
        HashSet<Character> hashset = new HashSet<Character>();

        for(int i=0;i<board.length;i++){
            // System.out.println("Length of array : " + board.length);
            for(int j=0; j<board[i].length; j++){
                if(hashset.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }else{
                    hashset.add(board[i][j]);
                }
            }
            hashset = new HashSet<Character>();
        }


        // Check for vertical lines.
        HashSet<Character> hashsetVertical = new HashSet<Character>();

        for(int i=0;i<9;i++){
            // System.out.println("Length of array : " + board.length);
            for(int j=0; j<board[i].length; j++){
                if(hashsetVertical.contains(board[j][i]) && board[j][i] != '.'){
                    return false;
                }else{
                    hashsetVertical.add(board[j][i]);
                }
            }
            hashsetVertical = new HashSet<Character>();
        }


        // The rows and columns have been checked above, now i need to check the 3x3 boxes.
        // I did i=i+3 becasue the next 3x3 box will start after 3 indexes, hence i=i+3.
        // this loops is iterating via the boxes in suduko only, not the actual 3x3 grid, that we will do inside the loop.
        for(int row=0;row<board.length;row=row+3){
            // I did j=j+3 becasue the next 3x3 box column-wise will start after 3 indexes, hence j=j+3.
            // this loops is iterating via the 9 boxes in suduko only, not the actual 3x3 grid, that we will do inside the loop.
            for(int col=0;col<board.length;col=col+3){

                // at [row][col]=0 we are at the starting point of the first box in the sudoku.in
                HashSet<Character> hashsetGrid = new HashSet<Character>();

                // in this for loop we are going to interate inside the 3x3 grid for unique values.
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        
                        // if(board[row+i][col+j])

                        if(hashsetGrid.contains(board[row+i][col+j]) && board[row+i][col+j] != '.'){
                            // hashsetGrid.add(board[row+i][col+j]);
                            return false;
                        }else{
                            // return false;
                            hashsetGrid.add(board[row+i][col+j]);
                        }
                    }
                }


            }
        }
        return true;
    }
}
