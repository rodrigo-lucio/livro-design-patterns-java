package br.com.lucio.adapter;

public class SMSAdapter implements SMSSender {

	private EnviadorSMS env;

	public SMSAdapter(EnviadorSMS env) {
		this.env = env;
	}

	@Override
	public boolean sendSMS(SMS sms) {
		String dest = sms.getDestino();
		String orig = sms.getOrigem();
		String[] txts = quebrarMsgs(sms.getTexto());
		try {
			env.enviarSMS(dest, orig, txts);
		} catch (SMSException e) {
			return false;
		}
		return true;
	}

	private String[] quebrarMsgs(String text) {
		int size = text.length();
		int qtd = (size % 160 == 0) ? size / 160 : size / 160 + 1;
		String[] msgs = new String[qtd];
		for (int i = 0; i < qtd; i++) {
			int min = i * 160;
			int max = (i == qtd - 1) ? size : (i + 1) * 160;
			msgs[i] = text.substring(min, max);
		}
		return msgs;
	}

}