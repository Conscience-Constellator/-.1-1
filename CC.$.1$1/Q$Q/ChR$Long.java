package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.ChR$Q;
import CC.$.Q$Q_LMNt.Q$Long;
import java.util.Collection;

public interface ChR$Long extends ChR$Q,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(ChR$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long ChR$Long(char In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Longg(char[] From,long[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(ChR$Long(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default long[] ChRg$Longg(char[] In)
			{
				long[] Out=new long[In.length];
				ChRg$Longg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Longg(Iterable<Character> From,Collection<Long> To){for(char In:From){To.add(ChR$Long(In));}}
}