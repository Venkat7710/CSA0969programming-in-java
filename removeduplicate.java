class removeduplicate
{
public static void main(String[] args)
{
int arr[]={10,20,20,30,40,40,50};
int len=arr.length;
int j=0;
for(int i=0;i<len-1;i++)
{
if(arr[i]!=arr[i+1])
{
arr[j++]=arr[i];
}
}
arr[j++]=arr[len-1];
for(int k=0;k<j;k++)
{
System.out.println(arr[k]);
}
}
}