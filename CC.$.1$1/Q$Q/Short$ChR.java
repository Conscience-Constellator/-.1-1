package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Q$ChR;
import CC.$.Q$Q_LMNt.Short$Q;
import java.util.Collection;

public interface Short$ChR extends Short$Q,Q$ChR
{
	Clas_Rap Class=Init_StRt_Nd(Short$ChR.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	char Short$ChR(short In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$ChRg(short[] From,char[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Short$ChR(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default char[] Shortg$ChRg(short[] In)
			{
				char[] Out=new char[In.length];
				Shortg$ChRg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$ChRg(Iterable<Short> From,Collection<Character> To){for(short In:From){To.add(Short$ChR(In));}}
}