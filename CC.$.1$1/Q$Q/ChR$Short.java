package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.ChR$Q;
import CC.$.Q$Q_LMNt.Q$Short;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR$Short extends ChR$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(ChR$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short ChR$Short(char In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Shortg(char[] From,short[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(ChR$Short(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default short[] ChRg$Shortg(char[] In)
			{
				short[] Out=new short[In.length];
				ChRg$Shortg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Shortg(Iterable<Character> From,Collection<Short> To){for(char In:From){To.add(ChR$Short(In));}}
}