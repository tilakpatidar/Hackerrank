#include<stdio.h>
int main(){
    int time,n;
    printf("Enter the time you have :");
    scanf("%d",&time);
    printf("Enter number of activities :");
    scanf("%d",&n);
    int arr[n];
    int i=0;
    for(;i<n;i++){
        scanf("%d",&arr[i]);
        
    }
    //sort the array
    int sor[n];
    int j=0;
    for(;j<n;j++){
        
        sor[j]=minElement(arr,j,n);
        
    }
    int ti=0;
    int x=0;
    for(;x<n;x++){
        
        if((ti+sor[x])<=time){
            printf("%dn",sor[x]);
            ti=ti+sor[x];
        }
        
    }
    
    return 0;
}
int minElement(int arr[],int k,int l){
    
    int temp=arr[k];
    for(;k<l;k++){
        if(arr[k]<temp){
            temp=arr[k];
        }
    }
    
    return temp;
}