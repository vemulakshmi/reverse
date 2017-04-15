
public class reverseword {
	

		public static void main(String[] args) {
			{
				System.out.println(" hello welcome to my app");
				 String st = new String(revWords("hello welcome to my app"));
		        String s = new String(revStr("hello welcome to my app"));
		       
		        
		        System.out.println(" reversed words is:-   "+st);
		        System.out.println(" reversed string by string:-      "+s);
		    }
		}
		    public static String revStr(String s){
		        StringBuilder sb = new StringBuilder();
		        for (int i=s.length()-1; i>=0;i--){
		            sb.append(s.charAt(i));
		        }
		        return sb.toString();
		    }

		    public static String revWords(String str) {
		        StringBuilder sb = new StringBuilder();
		        String revd = revStr(str);
		        for (String s : revd.split(" ")){
		            sb.append(revStr(s));
		            sb.append(" ");
		        }
		        return sb.toString();
		    }
		}



