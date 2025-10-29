package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.LMNt.Get_Q_By_Dubl;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$Point;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Dubl$Point<Out_Typ> extends Dubl$Q,Q$Point<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$Point.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	Out_Typ Dubl$Point(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Pointg(double[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Dubl$Point(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <Out extends Out_Typ>Out[] Dublg$Pointg(double[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				Dublg$Pointg(From,Out);

				return Out;
			}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default Out_Typ[] Dublg$Pointg(double[] From){return Dublg$Pointg(From,Get_Out_Typ());}
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default void Dublg$Pointg(Iterable<Double> From,Collection<Out_Typ> To){for(double In:From){To.add(Dubl$Point(In));}}
}