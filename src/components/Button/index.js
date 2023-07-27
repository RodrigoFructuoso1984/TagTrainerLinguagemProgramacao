import React, { Component } from 'react';
import { Text,View, TouchableOpacity, Alert } from 'react-native';
import PropTypes from 'prop-types';

/*
const Button = () => {

  return (
    <View>
        <Text>Button</Text>
    </View>
  );
}

export default Button;
*/

export default class Button extends Component {

    static propTypes = {
        alerta: PropTypes.string,
    };

    static defaultProps = {
        alerta: 'valor padrão',
      };

    render() {
        return (
            <TouchableOpacity onPress={ ()  =>  {
                    Alert.alert(this.props.alerta);
                }}
            >
                <View>
                    {this.props.children}
                </View>
            </TouchableOpacity>
        )
    }
}