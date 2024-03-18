import java.awt.Color;
import java.lang.annotation.Retention;
import java.security.PublicKey;

public class Test{
    public static final int YELLOW = new Color(250,201,20).getRGB();
    public static final int BLUE = new Color(17,13,99).getRGB();
    public static final int RED = new Color(196,0,15).getRGB();
    public static final int BLACK = new Color(5,5,5).getRGB();
    public static final int WHITE = new Color (255,255,255).getRGB();
    public static final int GREEN = new Color(35,138,51).getRGB();

    public static void main(String [] args){
        int[][] flagMatrix = new int [24][48];
        for(int h=1; h<=2; h+=1)
        for(int w=1; w<=2; w+=1){
            flagMatrix =createZAFFlag
            (h*12, w*24);
            JOptionPaneArrays.showColorArray2D(null, flagMatrix);
          

           
        }


    }
    public static int[][] createZAFFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.34);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] =RED;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.67);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] =WHITE;
            }
        }
        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] =BLUE;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] =WHITE;
            }
        }
        rowIni = (int) (height * 0.45);
        rowEnd = (int) (height * 0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] =GREEN;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 1;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = WHITE;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd/1.4);

        rowIni = 0;
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] =GREEN;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        rowIni = 2;
        rowEnd = (int) (height - 2);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] =YELLOW;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        rowIni = 3;
        rowEnd = (int) (height - 3);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] =BLACK;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        return flag;
    }
    


    public static int[][] createCOLFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0, rowEnd=0, colIni=0, colEnd=0;
        rowIni=(height*0)/4; // se empieza desde cero por que es el principio
        rowEnd=(height*2)/4;
        colIni=(width*0)/1;
        colEnd=(width*1)/1;

        for(int r=rowIni; r<rowEnd; r+=1)
        for(int c=colIni; c<colEnd; c+=1)
            flag[r][c]=YELLOW;

        rowIni=(height*2)/4; 
        rowEnd=(height*3)/4;
        colIni=(width*0)/1;
        colEnd=(width*1)/1;

        for(int r=rowIni; r<rowEnd; r+=1)
        for(int c=colIni; c<colEnd; c+=1)
            flag[r][c]=BLUE;

        rowIni=(height*3)/4;
        rowEnd=(height*4)/4;
        colIni=(width*0)/1;
        colEnd=(width*1)/1;

        for(int r=rowIni; r<rowEnd; r+=1)
         for(int c=colIni; c<colEnd; c+=1)
         flag[r][c]=RED;

        return flag;  


    }
    public  static int[][] banderapanama(int height, int widht){
        int [][] flag = new int  [height][widht];

        int rowIni=0, rowEnd=0, colini=0, colfin=0;

        rowIni=(height*0)/2;
        rowEnd=(height*1)/2;
        colini=(widht*0)/2;
        colfin=(widht*1)/2;

        for(int i=rowIni;i<rowEnd; i++)
        for(int j=colini; j<colfin; j++){
            flag[i][j]=WHITE;
        }
        
        rowIni=(height*0)/2;
        rowEnd=(height*1)/2;
        colini=(widht*1)/2;
        colfin=(widht*2)/2;
        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colfin; j++){
            flag[i][j]=RED;
        }
        rowIni=(height*1)/2;
        rowEnd=(height*2)/2;
        colini=(widht*0/2);
        colfin=(widht*1/2);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colfin; j++){
            flag [i][j]=BLUE;
        }
        rowIni=(height*1)/2;
        rowEnd=(height*2)/2;
        colini=(widht*1)/2;
        colfin=(widht*2)/2;

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colfin; j++){
            flag[i][j]=WHITE;
        }

        return flag;


    }
    public static int[][] banderachile(int height, int widht){
        int [][] flag = new int [height][widht];
        int rowIni=0, rowend=0, colIni, colEnd;
        int columna2=0, finalcolumna2=0;

        rowIni=(height*0)/2;
        rowend=(height*1)/2;
        colIni=(int)(widht*0);
        colEnd=(int)(widht*0.25);
        for(int i=rowIni; i<rowend; i++)
        for(int j=colIni; j<colEnd; j++){
            flag[i][j]=BLUE;
        }
        rowIni=(height*0)/2;
        rowend=(height*1)/2;
        columna2=(int)(widht*0.25);
       finalcolumna2=(int)(widht*0.99+1);
        for(int i=rowIni; i<rowend;i++)
        for(int j=columna2; j<finalcolumna2; j++){
            flag[i][j]=WHITE;
        }
        rowIni=(height*1)/2;
        rowend=(height*2)/2;
        colIni=(int)(widht*0.01);
        colEnd=(int)(widht*0.99+1);
        for(int i=rowIni; i<rowend; i++)
        for(int j=colIni; j<colEnd; j++){
            flag[i][j]=RED;

        }
        return flag;


        

    }

       public static int[][] banderausa(int height, int widht){
        int [][] flag= new int[height][widht];
        int rowIni=0, rowEnd=0, colini=0, colend=0;

        rowIni=(height*0)/2;
        rowEnd=(height*1)/2;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.25);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=BLUE;

        }

        rowIni=(height*0)/11;
        rowEnd=(height*1)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*1)/11;
        rowEnd=(height*2)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        rowIni=(height*2)/11;
        rowEnd=(height*3)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*3)/11;
        rowEnd=(height*4)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        rowIni=(height*4)/11;
        rowEnd=(height*5)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*5)/11;
        rowEnd=(height*6)/11;
        colini=(int)(widht*0.25);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        rowIni=(height*6)/11;
        rowEnd=(height*7)/11;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*7)/11;
        rowEnd=(height*8)/11;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        rowIni=(height*8)/11;
        rowEnd=(height*9)/11;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*9)/11;
        rowEnd=(height*10)/11;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        rowIni=(height*10)/11;
        rowEnd=(height*11)/11;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=RED;

        }
        rowIni=(height*11)/12;
        rowEnd=(height*12)/12;
        colini=(int)(widht*0.01);
        colend=(int)(widht*0.99+1);

        for(int i=rowIni; i<rowEnd; i++)
        for(int j=colini; j<colend; j++){
            flag[i][j]=WHITE;

        }
        return flag;
        

       }

       public static int[][] banderachecoslovaquia (int height, int width){

       
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = WHITE;
            }
        }

        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = BLUE;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        return flag;
    }
    

    

        
        public static int[][] banderadinamarca(int height, int width) {
            int[][] flag = new int[height][width];
            int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        
            
            rowIni = (int) (height * 0.01);
            rowEnd = (int) (height * 0.46);
            colIni = (int) (width * 0.0);
            colEnd = (int) (width * 0.25);
        
            for (int i = rowIni; i < rowEnd; i += 1)
                for (int j = colIni; j < colEnd; j++) {
                    flag[i][j] = RED;
                }

                rowIni = (int) (height * 0);
                rowEnd =  (height * 1)/2;
                colIni = (int) (width * 0.30);
                colEnd = (int) (width * 0.99+1);
            
                for (int i = rowIni; i < rowEnd; i += 1)
                    for (int j = colIni; j < colEnd; j++) {
                        flag[i][j] = RED;
                    }

                rowIni =  (int) (height*0);
                rowEnd = (int) (height * 0.99+1);
                colIni = (int) (width * 0.22);
                colEnd = (int) (width * 0.30);
            
                for (int i = rowIni; i < rowEnd; i += 1)
                    for (int j = colIni; j < colEnd; j++) {
                        flag[i][j] = WHITE;
                    }

                rowIni = (int) (height * 0.49);
                rowEnd = (int) (height * 0.59);
                colIni = (int) (width * 0.0);
                colEnd = (int) (width * 1);
            
                for (int i = rowIni; i < rowEnd; i += 1)
                    for (int j = colIni; j < colEnd; j++) {
                        flag[i][j] = WHITE;
                    }

                    rowIni = (int) (height * 0.60);
                rowEnd = (int) (height * 0.99+1);
                colIni = (int) (width * 0.0);
                colEnd = (int) (width * 0.22);
            
                for (int i = rowIni; i < rowEnd; i += 1)
                    for (int j = colIni; j < colEnd; j++) {
                        flag[i][j] = RED;
                    }
            
                    rowIni = (int) (height * 0.62);
                    rowEnd =  (int)(height * 2)/2;
                    colIni = (int) (width * 0.30);
                    colEnd = (int) (width * 0.99+1);
                
                    for (int i = rowIni; i < rowEnd; i += 1)
                        for (int j = colIni; j < colEnd; j++) {
                            flag[i][j] = RED;
                        } 
                        return flag;
          
    }
    public static int[][]banderafinlandia(int height, int widht){
        int [][] flag = new int[height][widht];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni=(int)(height*0);
        rowEnd=(int)(height*0.50);
        colIni=(widht*0)/3;
        colEnd=(int)(widht*0.22);

        for (int i = rowIni; i < rowEnd; i += 1)
                        for (int j = colIni; j < colEnd; j++) {
                            flag[i][j] = WHITE;
                        } 
        rowIni=(height*1)/3;
        rowEnd=(height*2)/3;
        colIni=(int)(widht*0);
        colEnd=(int)(widht*0.99+1);

        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
                      
    } 



        rowIni=(height*2)/3;
        rowEnd=(height*3)/3;
        colIni=(widht*0)/3;
        colEnd=(int)(widht*0.22);
                
        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
                                      
    } 
       
       rowIni=(height*0)/3;
        rowEnd=(height*1)/3;
        colIni=(int)(widht*0.22);
        colEnd=(int)(widht*0.40);
                
        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
                                       
    } 
                                        rowIni=(height*2)/3;
                                        rowEnd=(height*3)/3;
                                        colIni=(int)(widht*0.22);
                                        colEnd=(int)(widht*0.40);
                                                
                                        for (int i = rowIni; i < rowEnd; i += 1)
                                        for (int j = colIni; j < colEnd; j++) {
                                        flag[i][j] = BLUE;
                                                                        
                                    

                                    } 
    rowIni=(height*0)/3;
        rowEnd=(height*1)/3;
        colIni=(int)(widht*0.40);
        colEnd=(int)(widht*0.99+1);
                
        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
                                       
    } 
       rowIni=(height*2)/3;
        rowEnd=(height*3)/3;
        colIni=(int)(widht*0.40);
        colEnd=(int)(widht*0.99+1);
                
        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
                                       
    } 
       return flag;
        

    }
    public static int[][] banderanoruega(int height, int widht){
        int [][] flag = new int[height][widht];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni= (int)(height*0);
        rowEnd=(int)(height*0.40);
        colIni=(int)(widht*0);
        colEnd=(int)(widht*0.20);

        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
                                       
    } 

    rowIni= (int)(height*0.40);
        rowEnd=(int)(height*0.49);
        colIni=(int)(widht*0);
        colEnd=(int)(widht*0.22);

        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
                                       
    } 
    rowIni= (int)(height*0);
        rowEnd=(int)(height*0.40);
        colIni=(int)(widht*0.2);
        colEnd=(int)(widht*0.23);

        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
                                       
    } 
  
    rowIni= (int)(height*0.60);
        rowEnd=(int)(height*0.99+1);
        colIni=(int)(widht*0);
        colEnd=(int)(widht*0.23);

        for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
                                       
    } 
    rowIni= (int)(height*0.60);
    rowEnd=(int)(height*0.99+1);
    colIni=(int)(widht*0.2);
    colEnd=(int)(widht*0.23);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;
                                   
} 
rowIni= (int)(height*0.6);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.2);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;
                                   
} 
rowIni= (int)(height*0.47);
rowEnd=(int)(height*0.6);
colIni=(int)(widht*0);
colEnd=(int)(widht*0.99+1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = BLUE;
                               
} 
rowIni= (int)(height*0);
rowEnd=(int)(height*0.48);
colIni=(int)(widht*0.30);
colEnd=(int)(widht*0.35);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = WHITE;
                               
} 
rowIni= (int)(height*0.65);
rowEnd=(int)(height*0.99+1);
colIni=(int)(widht*0.30);
colEnd=(int)(widht*0.35);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = WHITE;
                               
} 
rowIni= (int)(height*0);
rowEnd=(int)(height*0.99+1);
colIni=(int)(widht*0.22);
colEnd=(int)(widht*0.30);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = BLUE;
                               
} 

rowIni= (int)(height*0.40);
rowEnd=(int)(height*0.48);
colIni=(int)(widht*0.3);
colEnd=(int)(widht*0.99+1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = WHITE;
                               
} 
rowIni= (int)(height*0.6);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0.3);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;
                                   
} 
rowIni= (int)(height*0.7);
    rowEnd=(int)(height*0.99+1);
    colIni=(int)(widht*0.36);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;
                                   
} 
rowIni= (int)(height*0);
    rowEnd=(int)(height*0.34);
    colIni=(int)(widht*0.35);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;
                                   
} 
       return flag;

    }
    public static int[][] polonia(int height, int widht){


        int[][] flag= new int [height][widht];

        int inicio=0, finalaltura=0, inicioancho=0, finalancho=0;

        inicio=(height*0)/2;
        finalaltura=(height*1)/2;
        inicioancho=(widht*0)/1;
        finalancho=(widht*1)/1;

        for(int i=inicio; i<finalaltura; i+=1)
        for(int j=inicioancho; j<finalancho; j+=1){
            flag[i][j]=WHITE;
        }
        
        inicio=(height*1)/2;
        finalaltura=(height*2)/2;
        inicioancho=(widht*0)/1;
        finalancho=(widht*1)/1;

        for(int i=inicio; i<finalaltura; i+=1)
        for(int j=inicioancho; j<finalancho; j+=1){
            flag[i][j]=RED;

        }
        return flag;
        

    }
    public static int[][] createVENE(int height, int width){
        int [][] flag = new int [height] [width];
        int inicio=0, finalaltura=0, anchoinicial=0, anchofinal;
    
        inicio=(height*0)/3;
        finalaltura=(height*1)/3;
        anchoinicial=(width*0)/1;
        anchofinal=(width*1)/1;
    
        for(int r=inicio; r<finalaltura; r+=1)
        for(int j=anchoinicial; j<anchofinal;j+=1){
            flag[r][j]=YELLOW;
        } 
    
    
    inicio=(height*2)/3;
    finalaltura=(height*3)/3;
    anchoinicial=(width*0)/1;
    anchofinal=(width*1)/1;
    
    for(int r=inicio; r<finalaltura; r+=1)
    for(int j=anchoinicial; j<anchofinal; j+=1){
        flag[r][j]=RED;
    }
    
    
    inicio=(height*1)/3;
    finalaltura=(height*2)/3;
    anchoinicial= (width*0)/1;
    anchofinal= (width*1)/1;
    
    for(int r=inicio; r<finalaltura; r+=1)
    for(int j=anchoinicial; j<anchofinal; j+=1){
        flag[r][j]=BLUE;
    }
    return flag;
    } 
    public static int[][] banderasuiza(int height, int widht){
        int [][] flag = new int[height][widht];
        int   rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni= (int)(height*0);
    rowEnd=(int)(height*0.1);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;
                                   
} 
rowIni= (int)(height*0.1);
    rowEnd=(int)(height*0.4);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.44);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.4);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.30);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.7);
    rowEnd=(int)(height*0.99);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.45
    );

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.99);
    rowEnd=(int)(height*0.99+1);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.1);
    rowEnd=(int)(height*0.4);
    colIni=(int)(widht*0.52);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.4);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0.64);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.7);
    rowEnd=(int)(height*0.99+1);
    colIni=(int)(widht*0.55);
    colEnd=(int)(widht*0.99+1);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = RED;

      

    }
    rowIni= (int)(height*0.1);
    rowEnd=(int)(height*0.99);
    colIni=(int)(widht*0.45);
    colEnd=(int)(widht*0.60);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;

      

    }
    rowIni= (int)(height*0.4);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0.30);
    colEnd=(int)(widht*0.60);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;

      

    }
    rowIni= (int)(height*0.4);
    rowEnd=(int)(height*0.7);
    colIni=(int)(widht*0.52);
    colEnd=(int)(widht*0.73);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = WHITE;

      

    }
    return flag;
}
public static int[][] banderaKUWAIT(int height, int widht){
    int [][] flag = new int[height][widht];
    int   rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
    rowIni= (int)(height*0);
    rowEnd=(int)(height*1);
    colIni=(int)(widht*0);
    colEnd=(int)(widht*0.05);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = BLACK;
    


}
rowIni= (int)(height*0.05);
    rowEnd=(int)(height*0.95);
    colIni=(int)(widht*0.020);
    colEnd=(int)(widht*0.099);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = BLACK;
    


}
rowIni= (int)(height*0.2);
    rowEnd=(int)(height*0.84);
    colIni=(int)(widht*0.030);
    colEnd=(int)(widht*0.14);

    for (int i = rowIni; i < rowEnd; i += 1)
    for (int j = colIni; j < colEnd; j++) {
    flag[i][j] = BLACK;
    



}
rowIni= (int)(height*0.25);
rowEnd=(int)(height*0.78);
colIni=(int)(widht*0.040);
colEnd=(int)(widht*0.17);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = BLACK;



}
rowIni= (int)(height*0.37);
rowEnd=(int)(height*0.70);
colIni=(int)(widht*0.050);
colEnd=(int)(widht*0.22);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = BLACK;



}



rowIni= (int)(height*0.37);
rowEnd=(int)(height*0.70);
colIni=(int)(widht*0.22);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = WHITE;

}


rowIni= (int)(height*0);
rowEnd=(int)(height*0.10);
colIni=(int)(widht*0.06);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = GREEN;

}
rowIni= (int)(height*0.10);
rowEnd=(int)(height*0.20);
colIni=(int)(widht*0.10);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = GREEN;

}

rowIni= (int)(height*0.20);
rowEnd=(int)(height*0.28);
colIni=(int)(widht*0.13);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = GREEN;

}
rowIni= (int)(height*0.28);
rowEnd=(int)(height*0.36);
colIni=(int)(widht*0.18);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = GREEN;

}
rowIni= (int)(height*0.70);
rowEnd=(int)(height*0.77);
colIni=(int)(widht*0.17);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = RED;

}
rowIni= (int)(height*0.75);
rowEnd=(int)(height*0.84);
colIni=(int)(widht*0.13);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = RED;

}
rowIni= (int)(height*0.84);
rowEnd=(int)(height*0.95);
colIni=(int)(widht*0.10);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = RED;

}
rowIni= (int)(height*0.95);
rowEnd=(int)(height*1);
colIni=(int)(widht*0.06);
colEnd=(int)(widht*1);

for (int i = rowIni; i < rowEnd; i += 1)
for (int j = colIni; j < colEnd; j++) {
flag[i][j] = RED;

}
return flag;
}
}





