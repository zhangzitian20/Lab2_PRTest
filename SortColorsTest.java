import org.example.Solution13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {
      @Test
      void testSortColors() {
            Solution13 solution = new Solution13();

            // Test case 1: Normal case with mixed colors
            int[] nums1 = {2, 0, 2, 1, 1, 0};
            solution.sortColors(nums1);
            assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

            // Test case 2: All zeros
            int[] nums2 = {0, 0, 0, 0, 0};
            solution.sortColors(nums2);
            assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums2);

            // Test case 3: All ones
            int[] nums3 = {1, 1, 1, 1, 1};
            solution.sortColors(nums3);
            assertArrayEquals(new int[]{1, 1, 1, 1, 1}, nums3);

            // Test case 4: All twos
            int[] nums4 = {2, 2, 2, 2, 2};
            solution.sortColors(nums4);
            assertArrayEquals(new int[]{2, 2, 2, 2, 2}, nums4);

            // Test case 5: Empty array
            int[] nums5 = {};
            solution.sortColors(nums5);
            assertArrayEquals(new int[]{}, nums5);

            // Test case 6: Single element array
            int[] nums6 = {1};
            solution.sortColors(nums6);
            assertArrayEquals(new int[]{1}, nums6);
      }
}