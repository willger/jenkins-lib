// vars/stepUpdate.groovy

def call(sclr, smsg) {
  if (binding.hasVariable('slackResponse')) {
      slackSend(botUser: true, color: sclr, channel: ts_id, message: smsg, tokenCredentialId: 'Slack-Max-Token', iconEmoji: 'dog', username: 'Dommie')
  } else {
      slackResponse = slackSend(botUser: true, color: sclr, channel: '#pipeline', message: smsg, tokenCredentialId: 'Slack-Max-Token',  iconEmoji: 'dog', username: 'Dommie')
      ts_id = slackResponse.threadId
  }
}

return this