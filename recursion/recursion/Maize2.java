public class Maize2 {
    public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        PathRestriction("",board,0,0);
        // Path("",3, 3);
    }
    static void Path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Path(p+"D", r-1, c);
        }
        if(c>1){
            Path(p+"R", r, c-1);
        } 
    }
    static void PathRestriction(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            PathRestriction(p+"D",maze, r+1, c);
        }
        if(c<maze[0].length-1){
            PathRestriction(p+"R",maze, r, c+1);
        } 
    }
}

