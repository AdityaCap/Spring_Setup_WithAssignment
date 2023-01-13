package com.shopping.main.Service;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.shopping.main.Model.Product;
@Service
public class ProductService {		
		 		public  List<Product> getList() {
//		        //add product objects in the list and return the list 
		        /* Creating objects manually */
		 			Product p1 = new Product(1,"Maggi", 4,10.0f);
		 			Product p2 = new Product(2,"Hide And Seek", 2,50.0f);
		 			Product p3 = new Product(3,"Tonic water", 4,99.0f);
		 			Product p4= new Product(4,"Patanjali", 4,100.0f);
		 			Product p5= new Product(5,"Chocolate", 4,25.0f);
		        /* Add them in the List */
		 			List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
		            return list;
		    }

	}



