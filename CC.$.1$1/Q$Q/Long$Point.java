package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Long$Q;
import CC.$.Q$Q_LMNt.Q$Point;

import java.util.Collection;
import static java.lang.reflect.Array.newInstance;

public interface Long$Point<Out_Typ> extends Long$Q,Q$Point<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Long$Point.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	Out_Typ Long$Point(long In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Pointg(long[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$Point(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <Out extends Out_Typ>Out[] Longg$Pointg(long[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				Longg$Pointg(From,Out);

				return Out;
			}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default Out_Typ[] Longg$Pointg(long[] From){return Longg$Pointg(From,Get_Out_Typ());}
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default void Longg$Pointg(Iterable<Long> From,Collection<Out_Typ> To){for(long In:From){To.add(Long$Point(In));}}
}