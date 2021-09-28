package Supermercado;

public class Producto {
	
	private int codigo;
	private String desc;
	private String marca;
	private Proveedor proveedor;
	private int precio;
	private boolean stock;
	private int stockMin;
	private int pedidosReposicion;
	
	public Producto(int codigo, String desc, String marca, Proveedor proveedor, int precio, boolean stock, int stockMin,
			int pedidosReposicion) {
		super();
		this.codigo = codigo;
		this.desc = desc;
		this.marca = marca;
		this.proveedor = proveedor;
		this.precio = precio;
		this.stock = stock;
		this.stockMin = stockMin;
		this.pedidosReposicion = pedidosReposicion;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public int getStockMin() {
		return stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public int getPedidosReposicion() {
		return pedidosReposicion;
	}

	public void setPedidosReposicion(int pedidosReposicion) {
		this.pedidosReposicion = pedidosReposicion;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
}
