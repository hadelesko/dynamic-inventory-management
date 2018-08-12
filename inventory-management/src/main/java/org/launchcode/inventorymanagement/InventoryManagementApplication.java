package org.launchcode.inventorymanagement;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.springframework.boot.SpringApplication.run;


@SpringBootApplication
public class InventoryManagementApplication {

	public static void main(String[] args){
		run(InventoryManagementApplication.class, args);
	}
}
