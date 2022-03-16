package ec.edu.uce;

import java.time.LocalDateTime;
import java.util.List;

public interface IFacturaRepo {

	void insertarFactura(Factura factura);

	List<Factura> buscarPorFechaJOIN(LocalDateTime fecha);

	List<Factura> buscarPorFechaLEFTJOIN(LocalDateTime fecha);

	List<Factura> buscarPorFechaWHERE(LocalDateTime fecha);

	List<Factura> buscarPorFechaJOINFetch(LocalDateTime fecha);

	Factura buscarPorCedula(String cedula);

}
