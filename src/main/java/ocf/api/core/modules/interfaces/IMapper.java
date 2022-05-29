package ocf.api.core.modules.interfaces;

public interface IMapper<TSource, UDestination> {
	public UDestination map(TSource source, UDestination destination);

}
