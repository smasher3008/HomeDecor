package com.HomeDecor.SupplierModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIER")
public class Supplier {

	

		@Id @GeneratedValue( strategy=GenerationType.AUTO )
		private long SupplierId;
		
		private String SupplierName = "";

		public long getSupplierId() {
			return SupplierId;
		}

		public void setSupplierId(long supplierId) {
			SupplierId = supplierId;
		}

		public String getSupplierName() {
			return SupplierName;
		}

		public void setSupplierName(String supplierName) {
			SupplierName = supplierName;
		}
		
		
	
	
}
