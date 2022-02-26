/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    Random rand = new Random();
    public int findKthLargest(int[] nums, int k){
        return quickSelect(nums, 0,nums.length-1,nums.length-k);
    }
    public int quickSelect(int[] a, int l, int r, int index){
        int q=randomPartition(a,l,r);
        if(q==index){
            return a[q];
        }else{
            return q<index?quickSelect(a,q+1,r,index):quickSelect(a,l,q-1,index);
        }
    }
    public int randomPartition(int[] a, int l, int r){
        int i=rand.nextInt(r-l+1)+l;          //这里写错了
        swap(a,i,r);return partition(a,l,r);
    }
    public int partition(int[] a, int l, int r){
        int x=a[r],i=l-1;
        for(int j=l;j<r;++j){
            if(a[j]<=x){
                swap(a,++i,j);
            }
        }
        swap(a,i+1,r);
        return i+1;
    }
    public void swap(int[] a, int l, int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public int findKthLargest(int[] nums, int k){
        int heapSize=nums.length;
        buildMaxHeap(nums,heapSize);
        for(int i=nums.length-1;i>=nums.length-k+1;--i){
            swap(nums,0,i);
            --heapSize;
            maxHeapify(nums,0,heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapsize){
        for(int i=heapsize/2;i>=0;--i){
            maxHeapify(a,i,heapsize);
        }
    }
    public void maxHeapify(int[] a, int i, int heapsize){
        int l=i*2+1,r=i*2+2,largest=i;
        if(l<heapsize&&a[l]>a[largest]){  //退出条件
            largest=l;
        }
        if(r<heapSize&&a[r]>a[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,heapsize);
        }
    }


}
// @lc code=end

