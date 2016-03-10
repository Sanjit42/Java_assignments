public class Matrix {
   private int rows, columns;
   private int [][] matrix;


   public static Matrix createMatrix(int rows,int columns, int []values){
      Matrix newMatrix = new Matrix(rows,columns);
      newMatrix.fillMatrix(values);
      return newMatrix;
   }

   private Matrix(int noOfRows, int noOfColumns){
      rows = noOfRows;
      columns = noOfColumns;
      matrix = new int[rows][columns];
   }

   private void fillMatrix (int[] values){
      int noOfRows = 0;
      int noOfColumns = 0;
      int counter = 0;
      while(counter<values.length){
         this.matrix[noOfRows][noOfColumns] = values[counter];
         noOfColumns++;
         counter++;
         if(noOfColumns == columns){
            noOfColumns = 0;
            noOfRows++;
         }
      }
   }
   public int getValue(int rowNumber, int colNumber){
      return matrix[rowNumber][colNumber];
   }
   public Matrix add(Matrix otherMatrix){
      Matrix resultMatrix = new Matrix(rows, columns);
      for (int i=0; i<rows; i++)
         for (int j=0; j<columns; j++)
            resultMatrix.matrix[i][j] = matrix[i][j] + otherMatrix.matrix[i][j];
      return resultMatrix;
   }

   public Matrix multiply(Matrix otherMatrix){
      Matrix resultMatrix = new Matrix(rows, columns);
      int i, j, k, sum = 0;
      for (i = 0; i<rows; i++) {
         for (j = 0; j<otherMatrix.columns; j++) {
            for (k = 0; k<columns; k++) {
               sum += matrix[i][k] * otherMatrix.matrix[k][j];
            }
            resultMatrix.matrix[i][j] = +sum;
            sum = 0;
         }
      }
      return resultMatrix;
   }

    private boolean isValue(int row,int column,int value){
        return this.matrix[row][column] == value;
    }

   public boolean isEqualTo(int[] expectedMatrix){
      int noOfRows = 0;
      int noOfColumns = 0;
      int count = 0;
      while(count < expectedMatrix.length){
           if(! this.isValue(noOfRows,noOfColumns,expectedMatrix[count++])) return false;
           noOfColumns++;
           if(noOfColumns >= columns){
              noOfRows++;
              noOfColumns = 0;
           }
      }
      return true;
   }

   public int determinant(){
      return getDeterminant(matrix);
   }

//   private boolean isSquare(){
//      return this.rows == this.columns;
//   }

   private int determinantOfTwoByTwo(int [][]matrix){
      return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
   }

   private int [][] getCoefficentMatrix(int[][] matrix, int index){
      int rows, columns, i, j;
      rows = matrix.length-1;
      columns = matrix.length-1;
      int [][] newMatrix = new int [rows][columns];
      for (i = 1; i<matrix.length; i++) {
         for (j = 1; i<matrix.length; i++) {
            if(index<j)
               newMatrix[i-1][j-1] = matrix[i][j];
            if(index>j)
               newMatrix[i-1][j] = matrix[i][j];
         }
      }
      return newMatrix;
   }

   private int sign (int index){
      if (index % 2 == 0) return 1;
      return -1;
   }

   private int matrix2By2(int [][] matrix){
      return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
   }

   private int getDeterminant(int [][] matrix){
      int i, result = 0;
      if(columns== 1 && rows == 1) return matrix[0][0];
      if(columns== 2 && rows == 2) return matrix2By2(matrix);
      for (i = 0; i<matrix.length; i++) {
         int [][] newMatrix = getCoefficentMatrix(matrix, i);
         result += (sign(i)) * matrix[0][i] * getDeterminant(newMatrix);
      }
      return result;
   }
}
