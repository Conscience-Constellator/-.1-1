package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Long$Q;
import CC.$.Q$Q_LMNt.Q$ChR;

import java.util.Collection;

public interface Long$ChR extends Long$Q,Q$ChR
{
	Clas_Rap Class=Init_StRt_Nd(Long$ChR.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	char Long$ChR(long In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$ChRg(long[] From,char[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$ChR(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default char[] Longg$ChRg(long[] In)
			{
				char[] Out=new char[In.length];
				Longg$ChRg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$ChRg(Iterable<Long> From,Collection<Character> To){for(long In:From){To.add(Long$ChR(In));}}
}