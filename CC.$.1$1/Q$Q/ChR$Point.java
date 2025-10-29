package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.ChR$Q;
import CC.$.Q$Q_LMNt.Q$Point;
import java.util.Collection;
import static java.lang.reflect.Array.newInstance;

public interface ChR$Point<Out_Typ> extends ChR$Q,Q$Point<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(ChR$Point.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	Out_Typ ChR$Point(char In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Pointg(char[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(ChR$Point(From[IndX]));}}
			default <Out extends Out_Typ>Out[] ChRg$Pointg(char[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				ChRg$Pointg(From,Out);

				return Out;
			}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default Out_Typ[] ChRg$Pointg(char[] From){return ChRg$Pointg(From,Get_Out_Typ());}
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default void ChRg$Pointg(Iterable<Character> From,Collection<Out_Typ> To){for(char In:From){To.add(ChR$Point(In));}}
}