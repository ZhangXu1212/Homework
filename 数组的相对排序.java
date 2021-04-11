class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
           //创建一个桶数组，存放数组内元素的出现次数，索引为元素值，值为出现次数
            int[] count = new int[1001];
            //遍历大数组，统计其中的次数并放入桶数组中，索引为元素值，值为出现次数
            for(int i = 0;i < arr1.length;++i){
                count[arr1[i]]++;
            }
            //创建结果数组
            int[] res = new int[arr1.length]; 
            //定义初始索引为0
            int s = 0;
            //循环遍历Arr2，并将其元素放入结果数组中(也会将arr1中值与arr2相同的放入结果数组)
            for(int i = 0;i < arr2.length;++i){
                while(count[arr2[i]] > 0){
                    res[s++] = arr2[i];
                    count[arr2[i]]--;
                }
            }
            //循环遍历剩余的数，如果有出现次数大于0，则也放入结果数组，注意加索引s
            for(int i = 0;i < 1001;++i){
                while(count[i] > 0){
                    res[s++] = i;
                    count[i]--;
                }
            }
            //返回结果数组
            return res;
    }
}