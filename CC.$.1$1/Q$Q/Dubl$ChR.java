package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$ChR;

import java.util.Collection;

public interface Dubl$ChR extends Dubl$Q,Q$ChR
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$ChR.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	char Dubl$ChR(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$ChRg(double[] From,char[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Dubl$ChR(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default char[] Dublg$ChRg(double[] In)
			{
				char[] Out=new char[In.length];
				Dublg$ChRg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$ChRg(Iterable<Double> From,Collection<Character> To){for(double In:From){To.add(Dubl$ChR(In));}}
}