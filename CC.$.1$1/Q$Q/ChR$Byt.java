package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.ChR$Q;
import CC.$.Q$Q_LMNt.Q$Byt;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR$Byt extends ChR$Q,Q$Byt
{
	Clas_Rap Class=Init_StRt_Nd(ChR$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte ChR$Byt(char In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Bytg(char[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(ChR$Byt(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default byte[] ChRg$Bytg(char[] In)
			{
				byte[] Out=new byte[In.length];
				ChRg$Bytg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Bytg(Iterable<Character> From,Collection<Byte> To){for(char In:From){To.add(ChR$Byt(In));}}
}