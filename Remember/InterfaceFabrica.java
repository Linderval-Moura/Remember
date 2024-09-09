package Remember;

import Remember.PadraoDecorator.Componente;

/*
 * Interface para implementar o padrão Factory Method
 * 
 */
public interface InterfaceFabrica {
    
    Componente getAgenda(int e);

}
