public class ContainermaxArea {
        public int maxArea(int[] height) {
            int n = height.length;
            if(n < 1) return 0;
            int left = 0, right = n-1;
            int maxarea = 0;
            while(left < right){
                if(height[left] > height[right]){
                    int area = (right - left) * height[right];
                    maxarea = Math.max(maxarea, area);
                    right--;
                }else{
                    int area = (right - left) * height[left];
                    maxarea = Math.max(maxarea, area);
                    left++;
                }
            }
            return maxarea;
        }    
}
