class Pattern{
		public static void main(String[] args){
				int space1=5,space2=-1;
				for(int i=0;i<5;i++){
					space1--;
					
					for(int j=0;j<space1;j++) System.out.print("  ");
					System.out.print("*");
					 for(int j=0;j<space2;j++){
						if(i!=4)	 System.out.print("  ");
						else System.out.print(" *");
					}
					if(i!=0) System.out.print(" *");
					System.out.println();
					space2+=2;
				}
				
		}
}