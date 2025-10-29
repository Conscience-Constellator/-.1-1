package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Q$Point;
import CC.$.Q$Q_LMNt.Short$Q;
import java.util.Collection;
import static java.lang.reflect.Array.newInstance;

public interface Short$Point<Out_Typ> extends Short$Q,Q$Point<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Short$Point.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	Out_Typ Short$Point(short In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Pointg(short[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Short$Point(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <Out extends Out_Typ>Out[] Shortg$Pointg(short[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				Shortg$Pointg(From,Out);

				return Out;
			}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default Out_Typ[] Shortg$Pointg(short[] From){return Shortg$Pointg(From,Get_Out_Typ());}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Pointg(Iterable<Short> From,Collection<Out_Typ> To){for(short In:From){To.add(Short$Point(In));}}
}