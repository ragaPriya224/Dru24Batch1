![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/78173d86-0c42-42bc-a407-1a714a362288)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/dae7b303-949c-4d07-9343-f757f495ac7a)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/502083a8-6074-4c00-82ce-b5e49ffe326d)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/f5a725bd-5612-4ae0-933a-c0151f1da06e)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/8221c25b-24bf-49c0-83ec-040628c492f7)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/d591708a-66ea-4fe2-98c7-c7833b1013a1)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/cf1d6db3-8f35-49b3-9261-5c5cfc5dc72c)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/ad58e874-063c-4240-9d5f-4f10494d1781)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/a8dd3ec7-7a7a-487e-989f-d050182030d3)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/eaa36b9b-f1ed-4a6b-b48c-dd40422d937b)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/cfd8e56f-6b8b-4224-804d-179388bd3755)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/068cb9da-ebfb-4d91-bdce-0fbf9783eb6a)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/d5cc76d3-e2e8-484b-a20c-99b069060a82)


![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/1d049e34-d29b-40a0-8f0c-ff66f9354490)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/b2afe7f8-03e7-493a-a61d-6517acc1fa20)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/b1302247-12c9-4ac0-8d92-d74200940645)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/30be1da2-81e6-4a72-8188-4416b3c93219)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/8cecb048-0a9f-4f7f-adf7-f8d90af71006)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/b87bcd93-00fa-45a5-b91c-b4600a8c931b)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/de2853e5-532d-4be9-bd27-dc6d7cc9c2eb)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/632011dc-a439-4429-9210-3a68a967295f)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/85d44204-7c60-4e38-b0e9-c5aaab9fdac3)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/9873f56e-6075-4f1e-94b5-481cf47bba3b)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/a5b41541-3a67-4eac-84d5-441730b739a6)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/aa182b6b-7fee-44ec-8378-4c236e996cf9)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/65441542-9d37-4261-9c7f-8c5d20755a2b)

![image](https://github.com/ragaPriya224/Dru24Batch1/assets/90038032/428f7c8a-6341-458e-afe3-169a444b4ae3)


	  public static Persons[] fetchDb(){
		  Persons m[]=null;
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	           Connection con=DriverManager.getConnection(  
	            "jdbc:mysql://localhost:3306/tyconsultDB","root","8438");
	            Statement stmt=con.createStatement();  
	                    
	            ResultSet rs=stmt.executeQuery("select * from persons");  
	            ArrayList<Persons> list=new ArrayList<Persons>();          
	            while(rs.next()) { 
	            list.add(new Persons(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
	            		rs.getString(5)));
	                m=new Persons[list.size()];
	                m= list.toArray(m);
	                  } 
	            
	        }catch(Exception e){ System.out.println(e);}  
	        System.out.println("length is:" +m.length);
	        for (int i = 0; i < m.length; i++) {
	        	  System.out.println(m[i]);
	        	}
	        return m;      
	        }


