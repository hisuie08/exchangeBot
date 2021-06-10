package me.nashiroaoi.exchangebot

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandClientBuilder
import com.jagrosh.jdautilities.command.CommandEvent
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent

class Exchange:Command(){
    init {
        this.name = "exchange"
        this.arguments = "<base> <target> <amount>"
    }
    
    override fun execute(event : CommandEvent?) {
        val args = event?.args?.split(Regex("[\u0020,]"))
        when(args?.count()){
            0-> argumentErrorBuilder(event)
            1-> argumentErrorBuilder(event)
            2-> exchangeBuilder(event,args[0],args[1])
            3-> exchangeBuilder(event,args[0],args[1],args[2].toInt())
        }
        
    }
}

class SearchCurrency:Command(){
    init {
        this.name = "search"
        this.arguments = "[key]"
    }
    
    override fun execute(event : CommandEvent?) {
        if(event?.args?.isNotEmpty()==true){
            event.args.let {key->
                val result = MoneyCodes.findByCurrency(key.toString())
                val embed = EmbedBuilder().also { embed->
                    embed.setTitle(":mag: ${event.args} の検索結果 (${result.count()}件)")
                    for(l in result){
                        embed.addField("${l.country}/${l.currency}",l.name,false)
                    }
                }.build()
                event.reply(embed)
            }
            
        }
    }
}

class BotClient{
    lateinit var jda: JDA
    fun main(token: String) {
        val commandClient = CommandClientBuilder()
            .setPrefix("")
            .addCommand(Exchange())
            .addCommand(SearchCurrency())
            .setOwnerId("")
            .build()
        
        jda = JDABuilder.createLight(token,
            GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(commandClient)
            .build()
    }
    
}

fun main(){
    val bot = BotClient()
    bot.main("TOKEN")
}