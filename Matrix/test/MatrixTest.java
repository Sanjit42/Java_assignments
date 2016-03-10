import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;

public class MatrixTest{
   @Test
   public void find_zero_when_do_not_give_any_value(){
      int [] value = {};
      Matrix matrix = Matrix.createMatrix(2, 2, value);
      assertEquals(0, matrix.getValue(0, 1));
      assertEquals(0, matrix.getValue(1, 1));
      assertEquals(0, matrix.getValue(0, 0));
   }

   @Test
   public void get_zero_every_positions_except_1st_position_when_give_only_one_number(){
      int [] value = {2};
      Matrix matrix = Matrix.createMatrix(2, 2, value);
      assertEquals(0, matrix.getValue(1, 0));
      assertEquals(0, matrix.getValue(1, 1));
      assertEquals(2, matrix.getValue(0, 0));
   }

   @Test
   public void find_position_value(){
      int []first_matrix = {1,2,3,4,5,6,7,8,9};
      int[] second_matrix = {8,2,3,14,5,6,7,0,8};
      Matrix matrix1 = Matrix.createMatrix(3, 3, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(3, 3, second_matrix);

      assertEquals(1, matrix1.getValue(0,0));
      assertEquals(6, matrix1.getValue(1,2));
      assertEquals(0, matrix2.getValue(2, 1));
      assertNotSame(0, matrix2.getValue(2, 0));
   }
   @Test
   public void create_matrix_with_values(){
      int []first_matrix = {1,2,3,4,5,6,7,8,9};
      int[] second_matrix = {8,2,3,14,5,6,7,0,8};
      Matrix matrix1 = Matrix.createMatrix(3, 3, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(3, 3, second_matrix);

      Matrix addition = matrix1.add(matrix2);
      int[] expected = {9,4,6,18,10,12,14,8,17};
      assertTrue(addition.isEqualTo(expected));
   }

   @Test
   public void create_matrix_with_negetive_values(){
      int []first_matrix = {-1,2,-3,-4};
      int[] second_matrix = {10,2,-0,1};
      Matrix matrix1 = Matrix.createMatrix(2, 2, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(2, 2, second_matrix);

      Matrix addition = matrix1.add(matrix2);
      int[] expected = {9,4,-3,-3};
      assertTrue(addition.isEqualTo(expected));
   }
   @Test
   public void create_matrix_2_by_3_with_values(){
      int []first_matrix = {-1,2,3,4,5,6};
      int[] second_matrix = {10,2,3,14,5,6};
      Matrix matrix1 = Matrix.createMatrix(2, 3, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(2, 3, second_matrix);

      Matrix addition = matrix1.add(matrix2);
      int[] expected = {9,4,6,18,10,121};

      assertEquals(6, addition.getValue(0, 2));
      assertTrue(!addition.isEqualTo(expected));
   }
   @Test
   public void create_matrix_3_by_2_with_values(){
      int []first_matrix = {-1,2,3,4,5,6};
      int[] second_matrix = {10,2,3,14,5,6};
      Matrix matrix1 = Matrix.createMatrix(3, 2, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(3, 2, second_matrix);

      Matrix addition = matrix1.add(matrix2);
      int[] expected = {9,4,6,18,10,121};

      assertEquals(9, addition.getValue(0, 0));
      assertTrue(!addition.isEqualTo(expected));
   }

   @Test
   public void matrix_with_values(){
      int []first_matrix = {1,2,3,4};
      int[] second_matrix = {2,3,4,5};
      Matrix matrix1 = Matrix.createMatrix(2, 2, first_matrix);
      Matrix matrix2 = Matrix.createMatrix(2, 2, second_matrix);

      Matrix multiply = matrix1.multiply(matrix2);
      int[] expected = {10, 13, 22, 29};

      assertEquals(10, multiply.getValue(0, 0));
      assertTrue(multiply.isEqualTo(expected));
   }

   @Test
   public void determinant_provides_the_determinant_of_a_2_by_2_matrix(){
      int [] value = {1,2,3,4};
      Matrix matrix = Matrix.createMatrix(2, 2, value);
      int determinant = matrix.determinant();

      int expected = -2;
      assertEquals(expected, determinant);
   }

   @Test
   public void determinant_provides_the_determinant_of_a_3_by_3_matrix(){
      int [] value = {1,2,3,4,5,6,7,8,9};
      Matrix matrix = Matrix.createMatrix(3, 3, value);
      int determinant = matrix.determinant();

      int expected = -0;
      assertEquals(expected, determinant);
   }
}
